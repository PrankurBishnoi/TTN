var arr = [];
function calInterest(){
    //console.log(i);
        if( document.getElementById("a1").style.display=="block")
         document.getElementById("a1").style.display = "none";

   var amnt = prompt("Enter tyhe amount:",);
    var rate = prompt("Enter the interest rate");
    var years = prompt("Enter the time in years");
    var interest;
    interest = (amnt*rate*years)/100;
  
   
    document.getElementById("amount").value = amnt;
    document.getElementById("amount").readOnly = true;
    document.getElementById("interest").value = rate;
    document.getElementById("interest").readOnly = true;
    document.getElementById("years").value = years;
    document.getElementById("years").readOnly = true;
    document.getElementById("ans1").innerHTML = "Hurray! Your Interest is "+interest;
    console.log("Shivam"+interest);
    document.getElementById("a1").style.display = "block";
    


}
function checkPalindrome()
{
    var str = document.getElementById("palindrome").value;
    var i;
    var flag=0;
    var len = str.length;
    console.log(str+len);
    for(i=0;i<(len/2);i++)
    {
        if(str.charAt(i)!= str.charAt(len-i-1))
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    {
        document.getElementById("respal").innerHTML = "string Not Palindnrome";

    }
    else{
        document.getElementById("respal").innerHTML = "string Palindnrome";
    }

}
function calArea()
{
    var radius = document.getElementById("radius").value;
    document.getElementById("a3").innerHTML = "The Area of circle is "+((Math.PI)*radius*radius);
}
function copyObject()
{
    var obj1 = new Object();
    obj1.name = "shivam";
    obj1.age=21;
    obj1.city="Pilibhit";
    obj1.hobby="reading News";
    console.log(obj1);
    var obj2 = new Object();
    console.log("Object 2 before copied is "+obj2);
    for(key in obj1)
    {
        obj2[key] = obj1[key];
        
    }
    console.log("After copying object1 into object2 is: ");
    console.log(obj2);

}
function Employee()
{

    var Employee1 = new Object();
    var ename = document.getElementById("ename");
    var eage = document.getElementById("eage");
    var esalary = document.getElementById("esalary");
    var edob = document.getElementById("edob");
    Employee1.name=ename.value;
    Employee1.age = eage.value;
    Employee1.Salary = esalary.value;
    Employee1.dob = edob.value;
    arr[arr.length]=Employee1;
    
    var table1 = document.getElementById("table1");
            var row = table1.insertRow(arr.length);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            var cell3 = row.insertCell(2);
            var cell4 = row.insertCell(3);
             cell1.innerHTML = arr[arr.length-1].name;
            cell2.innerHTML = arr[arr.length-1].age;
            cell3.innerHTML = arr[arr.length-1].Salary;
            cell4.innerHTML = arr[arr.length-1].dob;
            filterEmployee();
    
     //groupBy();

}
function filterEmployee()
{
    //console.log(arr[4]);
    var femp = arr.filter(function(ele){
        
            return ele.Salary>5000;

    });
    //for(var i=0;i<femp.length;i++)
            //console.log(femp[i]);
    var table = document.getElementById("table");
    var rows = table.getElementsByTagName("tr");
    var diff = (femp.length-rows.length)+1;
    if(diff!=0)
    {       
        console.log(diff);
       
            for(var i=femp.length-diff+1;i<=femp.length;i++)
            {
                var row = table.insertRow(i);
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                var cell3 = row.insertCell(2);
                var cell4 = row.insertCell(3);
                cell1.innerHTML = femp[i-1].name;
                cell2.innerHTML = femp[i-1].age;
                cell3.innerHTML = femp[i-1].Salary;
                cell4.innerHTML = femp[i-1].dob;


            }
        }
}
function groupBy()
{
    var obj = new Object();
    for(var i=0;i<arr.length;i++)
    {
        if(!(arr[i].age in obj))
        {
            var temp = new Array();
            temp[0] = arr[i];
            obj[arr[i].age]=temp;
        }
        else
        {
            (obj[arr[i].age]).push = arr[i];

        }
        



    }
    console.log(obj);

}
function updateData()
{
    for(var i=0;i<arr.length;i++)
    {
        if(arr[i].age>20 && arr[i].Salary<1000)
            arr[i].Salary = (arr[i].Salary)*5;
    }
}
function fetchEMP()
{
    var temp = arr.filter(function(ele)
    {
        return ((ele.Salary)<1000 && (ele.age>20));
    });
    var table = document.getElementById("table2");
    var rows = table2.getElementsByTagName("tr")
    var diff = (temp.length-rows.length)+1;
    if(diff!=0)
    {       
        console.log(diff);
       
            for(var i=temp.length-diff+1;i<=temp.length;i++)
            {
                var row = table2.insertRow(i);
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                var cell3 = row.insertCell(2);
                var cell4 = row.insertCell(3);
                var cell5 = row.insertCell(4);
                cell1.innerHTML = temp[i-1].name;
                cell2.innerHTML = temp[i-1].age;
                cell3.innerHTML = temp[i-1].Salary;
                cell4.innerHTML = (temp[i-1].Salary)*5;
                cell5.innerHTML = temp[i-1].dob;


            }
           updateData();
           var table1 = document.getElementById("table1");
           var table = document.getElementById("table");
           var rowlen1 = table1.rows.length;
           var rowlen2 = table.rows.length;
           for(var i=rowlen1-1;i>=1;i--)
            table1.deleteRow(i);
            for(var i=1;i<=arr.length;i++)
            {
                var row = table1.insertRow(i);
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                var cell3 = row.insertCell(2);
                var cell4 = row.insertCell(3);
                 cell1.innerHTML = arr[i-1].name;
                cell2.innerHTML = arr[i-1].age;
                cell3.innerHTML = arr[i-1].Salary;
                cell4.innerHTML = arr[i-1].dob;
            }
            for(var i=rowlen2-1;i>=1;i--)
            table.deleteRow(i);
                filterEmployee();

        }

}