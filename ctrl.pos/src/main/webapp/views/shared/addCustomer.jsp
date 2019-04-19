<script type="text/javascript">
$(document).ready(function () {
alert("I am here!");
$('#customerValidation').validate({
    rules: {
    	custName: {
            minlength: 2,
            required: true
        },
        custMobileNo:{
            minlength: 2,
            required: true
        },
        street:{
        	minlength: 2,
            required: true
        },
        email: {
            required: true,
            email: true
        }
    },
    highlight: function (element) {
        $(element).closest('.body').removeClass('success').addClass('error');
    },
    success: function (element) {
        element.text('OK!').addClass('valid')
            .closest('.body').removeClass('error').addClass('success');
    }
});
});
</script>
<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			${message}
			<!--                 <h2> -->
			<!--                     JQUERY DATATABLES -->
			<!--                     <small>Taken from <a href="https://datatables.net/" target="_blank">datatables.net</a></small> -->
			<!--                 </h2> -->
		</div>
		<!-- Basic Examples -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>Add Customer</h2>
						<ul class="header-dropdown m-r--5">
							<li class="dropdown"><a href="javascript:void(0);"
								class="dropdown-toggle" data-toggle="dropdown" role="button"
								aria-haspopup="true" aria-expanded="false"> <i
									class="material-icons">more_vert</i>
							</a>
								<ul class="dropdown-menu pull-right">
									<li><a href="javascript:void(0);">Action</a></li>
									<li><a href="javascript:void(0);">Another action</a></li>
									<li><a href="javascript:void(0);">Something else here</a></li>
								</ul></li>
						</ul>
					</div>
					<div class="body">
						<form action="addCustomer1" id="customerValidation">
							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="custName" /> <label
										class="form-label">Customer Name</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="custMobileNo" /> <label
										class="form-label">Mobile No </label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="email" /> <label
										class="form-label">E-Mail</label>
								</div>
							</div>


							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="street" /> <label
										class="form-label">Street</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="city" /> <label
										class="form-label">City</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="state" /> <label
										class="form-label">State</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="zipcode" /> <label
										class="form-label">ZipCode</label>
								</div>
							</div>

							<div class="form-group">
								<input type="radio" class="with-gap" name="custType"
									id="custType_checkbox_1"
									class="with-gap filled-in chk-col-grey" value="NormCust" /> <label
									for="custType_checkbox_1">Normal Customer</label> &nbsp&nbsp&nbsp <input
									type="radio" class="with-gap" name="custType" id="custType_checkbox_2"
									class="with-gap filled-in chk-col-grey" value="LoyalCust" /><label
									for="custType_checkbox_2">Loyalty Customer</label> 
							</div>

							<button class="btn btn-primary waves-effect" class="btn btn-success" type="submit">SUBMIT</button>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>