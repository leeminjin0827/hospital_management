console.log( "patient.js!!" );

// [1] 환자등록 함수
const pWrite = ( ) => {

    const pname = document.querySelector('.pname').value;
    const pdate = document.querySelector('.pdate').value;
    const pphone = document.querySelector('.pphone').value;
    const paddress = document.querySelector('.paddress').value;

    const obj = { name: pname , birthdate : pdate , phone : pphone , address : paddress };
    console.log( obj );

    axios.post( `/patient` , obj )
        .then( response => {
            console.log( "response.data = " + response.data );
            return response.data;
        })
        .then( data => {
            if( data === true ) {
                alert( "등록 성공!" );
                location.reload();
            } else{
                alert( "등록실패" );
            }
        })
        .catch( error => { console.log( error ); } )

} // f end

// 환자 전체 조회 함수
const pFindAll = async () => {
    // (동기화) await , async
    try{
        const response = await axios.get( `/patient` )
        console.log( response.data ); // response 응답객체 , response.data : 응답객체내 본문내용
        const tbody = document.querySelector( 'tbody' )
        let html = ``
            response.data.forEach( patient => {
                html += `<tr>
                            <td><a href="patient.html?patientid=${patient.patientid}&doctorid=${patient.doctorid}">${ patient.patientid }</a></td>
                            <td><a href="patient.html?patientid=${patient.patientid}">${ patient.name }</a></td>\
                            <td class="table_btn"><button onclick="pUpdate(${patient.patientid})" type="button">수정</button><button onclick="pDelete(${patient.patientid})" class="ml_5" type="button">삭제</button></td>
                        </tr>`
            })
        tbody.innerHTML = html;
    }catch( error ){ console.log( error ); }
} // f end
pFindAll(); // 최초 1회 실행

// 환자 수정 함수
const pUpdate = async ( patientid ) => {
    const pname = document.querySelector('.pname').value;
    const pdate = document.querySelector('.pdate').value;
    const pphone = document.querySelector('.pphone').value;
    const paddress = document.querySelector('.paddress').value;

    const obj = { patientid : patientid , name : pname , birthdate : pdate , phone : pphone , address : paddress };
    console.log( obj );

    const response = await axios.put( `/patient` , obj )
    if( response.data === true ) {
        alert( "수정되었습니다." );
        location.reload();
    }
    else{ alert( "수정실패" ); }
} // f end

// 학생 삭제 함수
const pDelete = async ( patientid ) => {
    const response = await axios.delete( `/patient?patientid=${patientid}` )
    if( response.data === true ) {
        alert( "삭제되었습니다." );
        location.reload();
    }
    else{ alert( "삭제실패" ); }
} // f end