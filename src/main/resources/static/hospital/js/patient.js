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
        .then( response => { console.log( response.data );  })
        .catch( error => { console.log( error ); } )

} // f end