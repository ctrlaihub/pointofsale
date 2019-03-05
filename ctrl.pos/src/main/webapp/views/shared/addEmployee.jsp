<section class="content">
	<div class="container-fluid">
		<div class="block-header">
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
						<h2>Add Employee</h2>
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
						<form action="addEmployee1">

							<div class="form-group form-float">
								<div class="form-line">

									<input type="text" class="form-control" name="name" /> <label
										class="form-label">Employee Name</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="password" class="form-control" name="password" />
									<label class="form-label">Password</label>
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

							<!--  <div class="form-group"> -->
							<div class="form-group form-float">
								<div class="form-line">
									<input type="radio" class="with-gap" name="authority"
										id="authority_checkbox_1" value="MANAGER" /> <label
										for="authority_checkbox_1">MANAGER</label> &nbsp&nbsp&nbsp <input
										type="radio" class="with-gap" name="authority"
										id="authority_checkbox_2" value="CASHIER" /> <label
										for="authority_checkbox_2">CASHIER</label> &nbsp&nbsp&nbsp <input
										type="radio" class="with-gap" name="authority"
										id="authority_checkbox_3" value="ADMIN" /> <label
										for="authority_checkbox_3">ADMIN</label> &nbsp&nbsp&nbsp <input
										type="radio" class="with-gap" name="authority"
										id="authority_checkbox_4" value="SELLER" /> <label
										for="authority_checkbox_4">SELLER</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="radio" class="with-gap" id="ig_radio"
										name="active" value="true"> <label for="ig_radio">Active</label>
									&nbsp&nbsp&nbsp <input type="radio" class="with-gap"
										id="ig_radio1" name="active" value="false"> <label
										for="ig_radio1">InActive</label>
								</div>
							</div>

							<div class="col-xs-4">
								<div class="form-group">
									<label class="control-label">Upload Photo</label> 
									<input type="file" class="filestyle" data-icon="false">
								</div>
							</div>


							<button class="btn btn-primary waves-effect" type="submit">SUBMIT</button>
							<!--  </div>
                             -->
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>