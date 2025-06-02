$(“p”).click(function() {
    alert( “Someone clicked on a paragraph!” )
    });
    <button id="show">Make the images appear</button>
<button id="hide">Hide the images</button><br />
<img src="https://pixabay.com/static/uploads/photo/2014/03/05/19/23/dog-
280332_960_720.jpg">
<img src="https://pixabay.com/static/uploads/photo/2016/02/18/18/37/puppy-
1207816__340.jpg">
<img
src="https://pixabay.com/static/uploads/photo/2015/02/02/17/06/chihuahua-
621112__340.jpg">
<script src="jquery.js"></script>
<script>
$(function() {
$('#show').on('click', function() {
$('img').first().show('slow', function showNextOne() {
$(this).next('img').show('slow', showNextOne);
});
});
$('#hide').on('click', function() {
$('img').first().hide('slow', function hideNextOne() {
$(this).next('img').hide('slow', hideNextOne);
});
});
});
</script>