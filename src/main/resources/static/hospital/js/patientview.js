console.log( "patientview.js!! " );
// 환자 상세 조회
const pFindOne = async () => {
    // URL 에서 patientid 가져오기
    const purl = new URLSearchParams(window.location.search);
    console.log( purl );
    const patientid = purl.get('patientid');
    console.log( patientid );
    try{
        const response = await axios.get( `/patient/view?patientid=${patientid}` );
        console.log( response.data );

        const patient = response.data;
        const tbody = document.querySelector( '.pttable' );
        let html = `<tr>
                        <td>${ patient.patientid }</td>
                        <td>${ patient.name } </td>
                        <td>${ patient.birthdate }</td>
                        <td>${ patient.phone }</td>
                        <td>${ patient.address }</td>
                        <td>${ patient.createdat }</td>
                    </tr>`
        tbody.innerHTML = html;
    }catch( error ){ console.log( error); }
} // f end
pFindOne();

// 환자 예약 목록 조회 함수
const pAppointment = async (patientid) => {
    try {
        // 환자별 예약 목록 요청
        const response = await axios.get(`/appointment/view1?patientid=${patientid}`);
        console.log( response );
        console.log(response.data);  // 응답 데이터를 확인
        const appointments = response.data;
        appointments.forEach(appointment => {
            console.log(appointment);  // 각 예약 객체를 확인하여 doctorName이 있는지 확인
        });

        // 예약 목록 출력
        const appointmentList = document.querySelector('.pbtable');
        let html = '';
        appointments.forEach(appointment => {
            html += `
                <tr>
                    <td>${appointment.doctor_name}</td>
                    <td>${appointment.appointmentdate}</td>
                    <td>${appointment.appointmenttime}</td>
                    <td>${appointment.status === 1 ? '예약됨' : '취소됨'}</td>
                </tr>
            `;
        });
        appointmentList.innerHTML = html;
    } catch (error) {
        console.error("예약 목록 조회 오류:", error);
    }
}; // pAppointment 함수 종료

// URL에서 patientid 가져오기
const purl = new URLSearchParams(window.location.search);
const patientid = purl.get('patientid');

// 환자 예약 목록 조회
pAppointment(patientid); // 예약 목록 로드
