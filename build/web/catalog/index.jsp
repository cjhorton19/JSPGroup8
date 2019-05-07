<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/column_left_catalog.jsp" />

<!-- start the middle column -->

<!-- If necessary, this page could be generated from the database. -->
<section>

<h1>Show Products</h1>

<form action="CatalogController">

    <input type="hidden" name="currentPage" value="1">
    
    <div class="form-group col-md-4">

        <label for="records">Select records per page:</label>

        <select class="form-control" id="records" name="recordsPerPage"> 
            <option value="5">5</option> 
            <option value="10" selected>10</option>
            <option value="15">15</option>
        </select>

    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>

</form>

<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" ></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" ></script>

</section>

<section>
    <h1>Featured Products</h1>

    <div class="container">
        <div class="column-center">
            <a href="/mens"> <img  src="/images/side_picture.jpg" alt="Girl in a jacket" style="width:500px;height:600px;"></a>
        </div>
        <div class="column-left">
            <a href="/women"> <img  src="/images/women_section.jpg" alt="Girl in a jacket" style="width:500px;height:600px;"></a>
        </div>
        <div class="column-right">
            
        </div>
    </div>
    

        
</section>

<!-- end the middle column -->

<jsp:include page="/includes/column_right_news.jsp" flush="true" />
<jsp:include page="/includes/footer.jsp" />