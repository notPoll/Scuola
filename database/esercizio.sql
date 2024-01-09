create table Docente(
    IDdocente int auto_increment,
    Nome varchar(20) not null,
    Cognome varchar(20) not null,
    Dipartimento varchar(20)
    primary key (IDdocente)
)
create table Corso(
    IDcorso int auto_increment,
    Nome varchar(20) not null,
    primary key (IDcorso),
    foreign key(IDdocente) references Docente(IDdocente) on update cascade,

);