<prefix> espacio =>rotamos terminal de vertical o horizontal
<prefix> c =>crea una nueva stancia de tmux
<prefix> [num] te lleva a esa stancia de tmux
<prefix> x => cierra la estancia actual
<prefix> % => Divide Verticalmente
<prefix> " => Divide Horizonralmente

[session]
ctrl b s => muestra todo el buffer y estancias abiertas
ctrl b w => muestra todo el buffer y estancias abiertas
[Ter] => tmux list-sessions => muestra sesiones attachrs

ctrl b , => Renombre una estancia
ctrl b z => Maximiza la ventana actual
ctrl b [ => Modo copia
[MCopia] ctrl s => busca una palabra en tarminal
:swap-window -s 2 -t 1

Command tmux

## tmux list-session

## tmux kill-session -t [name-session]

## tmux attach -t [name-session]

## tmux new-window -t [name-session] -n [new-name-windows]
