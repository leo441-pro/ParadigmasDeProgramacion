alumno(ana).
alumno(luis).
alumno(marta).
alumno(pedro).
alumno(sofia).
alumno(juan).

profesor(carlos).
profesor(laura).
profesor(miguel).

materia(matematicas).
materia(historia).
materia(fisica).
materia(programacion).

edad(ana,15).
edad(luis,16).
edad(marta,15).
edad(pedro,17).
edad(sofia,16).
edad(juan,17).

grupo(ana, "1a").
grupo(luis,"1a").
grupo(marta,"1b").
grupo(pedro,"2a").
grupo(sofia,"2a").
grupo(juan, "2b").

imparte(carlos,matematicas).
imparte(laura,historia).
imparte(miguel,fisica).
imparte(carlos,programacion).
inscrito(ana,matematicas).
inscrito(ana,programacion).
inscrito(luis,historia).
inscrito(marta,fisica).
inscrito(pedro,programacion).
inscrito(sofia,matematicas).
inscrito(juan,fisica).

calificacion(ana,matematicas,9).
calificacion(ana,programacion,10).
calificacion(luis,historia,8).
calificacion(marta,fisica,9).
calificacion(pedro,programacion,7).
calificacion(sofia,matematicas,10).
calificacion(juan,fisica,8).

asistencia(ana,matematicas,10).
asistencia(ana,programacion,9).
asistencia(luis,historia,8).
asistencia(marta,fisica,10).
asistencia(pedro,programacion,6).
asistencia(sofia,matematicas,9).
asistencia(juan,fisica,7).

alumno_mayor_16(Alumno):-
	edad(Alumno, Y),
	Y > 16.

alumno_destacado(Alumno, Materia):-
    calificacion(Alumno, Materia, Y), Y >= 9,
    asistencia(Alumno, Materia, Z), Z >=8.