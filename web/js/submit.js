
$("#button2").click(function(){
    $.post("/signin",
        {
            Name: document.getElementById("Name").value,
            Email: document.getElementById("Email").value,
            Pass: document.getElementById("Pass").value
        },
        function(data, status){
            alert("Data: " + data + "\nStatus: " + status);
            window.location.replace("signup.html");
        });
});

$("#button1").click(function(){
    $.post("/registration",
        {
            Name: document.getElementById("Name").value,
            Email: document.getElementById("Email").value,
            Pass: document.getElementById("Pass").value
        },
        function(data, status){
            alert("Data: " + data + "\nStatus: " + status);
            window.location.replace("shop");
        });
});

$("#update").click(function(){

    $.post("/admin",
        {
            Function: "Update",
            Id: 2,
            Pass: "12423"
        },
        function(data, status){
            alert("Data: " + data + "\nStatus: " + status);
            window.location.replace("admin");
        });
});

$('.editable').on('keyup', function() {

    alert('editable changed')
});