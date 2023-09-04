// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarAlumnos();
  $('#alumnos').DataTable();
});

async function cargarAlumnos(){

  const request = await fetch('api/alumnos', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const alumnos = await request.json();

    let listadoAlumno='';
    for(let alumno of alumnos){
    let btnEliminar= '<a href="#" onclick="eliminarAlumno('+alumno.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'
    let alumnoMostrar = '<tr><td>'+alumno.id+'</td><td>'+alumno.nombre+'</td><td>'+alumno.apellido+'</td><td>'+alumno.cedula+'</td><td>'+alumno.correo+'</td><td>'+alumno.celular+'</td><td>'+alumno.ciudad+'</td><td>'+alumno.contrasenia+'</td><td>'+btnEliminar+'</td></tr>';
    listadoAlumno+=alumnoMostrar;
    }
  console.log(alumnos);
  document.querySelector('#alumnos tbody').outerHTML=listadoAlumno;

}

async function eliminarAlumno(id){
    if(confirm('Está seguro que desea eliminar los datos de este alumno?')){
        const request = await fetch('api/alumnos/' + id, {
                method: 'DELETE',
                headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
                }
              });
        cargarAlumnos();
    } else {
        alert('No se eliminaron los datos del alumno');
    }

}