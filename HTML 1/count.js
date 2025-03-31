function change()
{
    let input=document.getElementById('text').value;
    let arr=input.split(' ') ;
    let v=arr.length;
    document.getElementById('para').innerHTML=v;
}