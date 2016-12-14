$(".read-more-button").click(function() {
    $.get("/product",
        {

            ProductId: document.getElementById(this.id).value

        },
        function(data){
        alert(data);
        }
    )
});

$(".buy-button").click(function(){
    $.get("/product",
        {
            Id: this.id
        },
        function(data){
            alert(data);
            location.reload()

        }
    )
});

$("#button1").click(function(){
    $.post("/registration",
        {
            FirstName: document.getElementById("FirstName").value,
            LastName: document.getElementById("LastName").value,
            Email: document.getElementById("Email").value,
            Pass: document.getElementById("Pass").value
        },
        function(data, status){
            alert(data + "\nStatus: " + status);
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