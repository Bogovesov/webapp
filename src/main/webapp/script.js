$(document).ready(function () {

    $("#button1").click(function () {
        var value = $('#input1').val();

        if (!value) {
           alert("Array is empty!")
        } else {
            $.ajax({
                url: '/ask',
                method: 'POST',
                data: {arrayText: value}
            }).done(function (data) {
                $('#input2').val(data);
            });
        }
    });
});

