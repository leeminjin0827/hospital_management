console.log( "doctorview.js!! " );
// 의사 상세 조회
const pFindOne = async () => {
    // URL 에서 doctorid 가져오기
    const durl = new URLSearchParams( window.location.search );
    console.log( durl );
    const doctorid = durl.get( "doctorid" );
    console.log( doctorid );

    const response = await axios.get( `/doctor/view?doctorid=${doctorid}` );
    console.log( response.data );

    const doctor = response.data;
    const tbody = document.querySelector( 'tbody' );
    let html = `<tr>
                    <td>${ doctor.name }</td>
                    <td>${ doctor.specialty }</td>
                    <td>${ doctor.phone }</td>
                    <td>${ doctor.createdat }</td>
                </tr>`
} // f end
pFindOne(); // 최초 1회 실행