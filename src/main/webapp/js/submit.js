/**
 * Created by nick on 20.11.16.
 */
$("#button1").click(function(){
    $.post("/registration",
        {
            FirstName: document.getElementById("FirstName").value,
            LastName: document.getElementById("LastName").value,
            Email: document.getElementById("Email").value,
            Pass: document.getElementById("Pass").value
        },
        function(data, status){
            alert("Data: " + data + "\nStatus: " + status);
            // window.location.replace("shop");
        });
});

$("#update").click(function(){



    $.post("/admin",
        {
            Function: "Update",
            Id: 1,
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