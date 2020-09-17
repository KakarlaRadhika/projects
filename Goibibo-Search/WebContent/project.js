document.getElementById('firstname').addEventListener('keypress',()=>
{
    if(document.getElementById('firstname').value.length<4){
    	
    document.getElementById('disp').style.visibility='visible'
   
    }
    else{
        document.getElementById('disp').style.visibility='hidden'
    
    }
})

document.getElementById("lastname").addEventListener('keypress',()=>{
 if(document.getElementById("lastname").value.length<4){
    document.getElementById('disp1').style.visibility='visible'

}
else{
    document.getElementById('disp1').style.visibility='hidden'
    }
})

document.getElementById("email").addEventListener('keypress',()=>{
if(document.getElementById("email").value.indexOf("@",0)<0){
    document.getElementById("disp3").style.visibility='visible'
}
else{
    document.getElementById('disp3').style.visibility='hidden'

}
})
document.getElementById("email").addEventListener('keypress',()=>{
if(document.getElementById("email").value.indexOf(".",0)<0){
    document.getElementById("disp3").style.visibility='visible'
}
else{
    document.getElementById('disp3').style.visibility='hidden'

}
})
document.getElementById("pwd").addEventListener('keypress',()=>{
if(document.getElementById("pwd").value.length<6){

    document.getElementById('disp4').style.visibility='visible'
}
else{
    document.getElementById('disp4').style.visibility='hidden'

}})

function validate1(){
   
                if(document.getElementById('name').value===""){
                    alert('User name Empty')}
                   
                if(document.getElementById('pwd1').value===""){
                    alert('password compulsary')}
                                             
    
   
    

    
}
function validate2(){
    if(document.getElementById('firstname').value===""){
        alert('firstname compulsary')}
          
    
        if(document.getElementById('lastname').value===""){
            alert('lastname compulsary')}
                if(document.getElementById('email').value===""){
                    alert('password compulsary')}
                   
                if(document.getElementById('pwd2').value===""){
                    alert('password compulsary')}
                                             
                var a = document.form.fn.value;
                if(a=="")
                {
                alert("Please Enter Your Name");
                document.form.name.focus();
                return false;
                }
                if(!isNaN(a))
                {
                alert("Please Enter Only Characters");
                document.form.name.select();
                return false;
                }
    

    
}
