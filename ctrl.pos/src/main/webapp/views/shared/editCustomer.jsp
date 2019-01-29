<section class="content">
	<div class="container-fluid">
		<div class="block-header">
		<script type="text/javascript">
		alert("I am in Edit Customer.jsp");
		</script>
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
						<h2>Edit Customer</h2>
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
						<form action="editCustomer1">
						<input type = "hidden" name="id" value="${customer.id}">
							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="custName" value="${customer.custName}"/> <label
										class="form-label">Customer Name</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="custMobileNo" value = "${customer.custMobileNo}"/> <label
										class="form-label">Mobile No </label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="email" value = "${customer.email}"/> <label
										class="form-label">E-Mail</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="street" value = "${customer.address.street}"/> <label
										class="form-label">Street</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="city" value = "${customer.address.city}"/> <label
										class="form-label">City</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="state" value = "${customer.address.state}"/> <label
										class="form-label">State</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="zipcode" value = "${customer.address.zipcode}"/> <label
										class="form-label">ZipCode</label>
								</div>
							</div>

							<div class="form-group">
								<input type="checkbox" name="custType"
									id="custType_checkbox_1"
									class="with-gap filled-in chk-col-grey" value="NormCust" /> <label
									for="custType_checkbox_1">Normal Customer</label> &nbsp&nbsp&nbsp <input
									type="checkbox" name="custType" id="custType_checkbox_2"
									class="with-gap filled-in chk-col-grey" value="LoyalCust" /><label
									for="custType_checkbox_2">Loyalty Customer</label> 
							</div>

							<button class="btn btn-primary waves-effect" type="submit">SUBMIT</button>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>