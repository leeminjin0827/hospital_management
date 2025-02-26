console.log( "doctor.js!! " );

// [1] 의사 등록 함수
const dWrite = ( ) => {
    const dname = document.querySelector( '.dname' ).value;
    const dspecialty = document.querySelector( '.dspecialty' ).value;
    const dphone = document.querySelector( '.dphone' ).value;

    const obj = { name : dname , specialty : dspecialty , phone : dphone };
    console.log( obj) ;

    axios.post( `/doctor` , obj )
        .then( response => {
            console.log( "response.data = " + response.data );
            return response.data;
        })
        .then( data => {
            if( data === true ) {
                alert( "등록 성공!" );
                location.reload();
            }else{
                alert( "등록실패" );
            }
        })
        .catch( error => { console.log( error ); } )

} // f end

// 의사 전체 조회 함수
const dFindAll = async () => {
    try{
        const response = await axios.get( `/doctor` )
        console.log( response.data );
        const tbody = document.querySelector( 'tbody' );
        let html = ``
            response.data.forEach( doctor => {
                html += `<tr>
                             <td><a href="doctor.html?doctorid=${doctor.doctorid}">${ doctor.doctorid }</a></td>
                             <td><a href="doctor.html?doctorid=${doctor.doctorid}">${ doctor.name }</a></td>
                             <td class="table_btn"><button onclick="dUpdate(${doctor.doctorid})" type="button">수정</button><button onclick="dDelete(${doctor.doctorid})" class="ml_5" type="button">삭제</button></td>
                        </tr>`
            })
        tbody.innerHTML = html;
    }catch( error ){ console.log( error ); }
} // f end
dFindAll(); // 최초 1회 실행

// 의사 수정 함수
const dUpdate = async ( doctorid ) => {
    const dname = document.querySelector( '.dname' ).value;
    const dspecialty = document.querySelector( '.dspecialty' ).value;
    const dphone = document.querySelector( '.dphone' ).value;

    const obj = { doctorid : doctorid , name : dname , specialty : dspecialty , phone : dphone };
    console.log( obj) ;

    const response = await axios.put( `/doctor` , obj )
    if( response.data === true ){
        alert( "수정되었습니다." );
        location.reload();
    }
    else{ alert( "수정실패" ); }
} // f end

// 의사 삭제 함수
const dDelete = async ( doctorid ) => {
    const response = await axios.delete( `/doctor?doctorid=${doctorid}` )
    console.log( response );
    if( response.data === true ) {
        alert( "삭제되었습니다." );
        location.reload();
    }else{ alert( "삭제실패" ); }
} // f end