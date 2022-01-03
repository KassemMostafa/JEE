

function otherGenre(){
    a=document.getElementById('other_genre');
    a.checked=true;
    }

function Genre(){
    a=document.getElementById('genre');
    a.value="";
    }

function biencopie(mailinglist){
    navigator.clipboard.writeText(mailinglist);
    alert("mailing liste copiée dans le press papier");
    }