$(document).ready(function() {
  //se ejecuta al cargar la página
});

async function registrarAlumno(){
  let datosAlumno= {};
  datosAlumno.nombre=document.getElementById('nombre').value;
  datosAlumno.apellido=document.getElementById('apellido').value;
  datosAlumno.cedula=document.getElementById('cedula').value;
  datosAlumno.celular=document.getElementById('celular').value;
  datosAlumno.ciudad=document.getElementById('ciudad').value;
  datosAlumno.contrasenia=document.getElementById('contrasenia').value;
  datosAlumno.correo=document.getElementById('correo').value;

  const request = await fetch('api/alumnos', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datosAlumno)
  });
  // const alumnos = await request.json();
}
