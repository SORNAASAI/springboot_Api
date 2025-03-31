
function change1()
{
    var tag=document.createElement('LI');
    var size=document.createTextNode('MadhuMahal');
    tag.appendChild(size);
    document.getElementById('name').appendChild(tag);
}
function change2()
{
    var item=document.getElementById('d');
    document.getElementById('name').removeChild(item);
}
function change3()
{
    var rep=document.getElementById('b');
    var ab=document.createElement('LI');
    var cd=document.createTextNode('Ramada Plaza');
    ab.appendChild(cd);
    document.getElementById('name').replaceChild(ab,rep);
}  
