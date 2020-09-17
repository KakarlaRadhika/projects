var mainControl=(function(){
    document.getElementById('btn').addEventListener('click',()=>{
        ctrlAdd();
    })
    document.getElementById('amt').addEventListener('keypress',(event)=>{
        if(event.keyCode===13){
        ctrlAdd();
    }
    })

    var ctrlAdd=function(){
        var inputData=uiControl.inputData()
array=[inputData.description,inputData.type,inputData.amt]
var string=array.toString();
var displayData=uiControl.inputData();
var mon=uiControl.display();
        console.log(displayData.description)
        console.log(displayData.type)
        console.log(displayData.amt)
var calculate=transaction.transactionData(displayData.type,displayData.description,displayData.amt);
if(inputData.type==='deposit'){
    console.log(string)
    let newBal=document.createElement('p')
    newBal.textContent=string;
    document.getElementById('disc').appendChild(newBal);

}
else if(inputData.type==='withdraw'){
    let newBal1=document.createElement('p')
    newBal1.textContent=string;
    document.getElementById('wis').appendChild(newBal1);
}


    document.getElementById('dep').innerHTML=calculate.dep
         document.getElementById('withd').innerHTML=calculate.withd
              document.getElementById('bal').innerHTML=calculate.bal
         
    }
})(uiControl,transaction);

var uiControl=(function(){
    return{
        inputData:function(){
            return{
                type:document.getElementById('drop').value,
                description:document.getElementById('des').value,
                amt:Number(document.getElementById('amt').value),
            }
        },
        display:function(){
            const month=['january','febrauary','march','april','may','june','july','august','september','october','november','december']
     const today=new Date();  
        document.getElementById('z').innerHTML=month[today.getMonth()];


        }
    }
})();

var transaction=(function(){
    var dep=0
    var withd=0
        var bal=0
    
return{
    transactionData:function(type,description,amt){
        if(type=='deposit'){
            bal=bal+amt
            dep=dep+amt
        }
        else{
            bal=bal-amt
            withd=withd+amt
        }
        return{bal,withd,dep}
    }
}
})();

