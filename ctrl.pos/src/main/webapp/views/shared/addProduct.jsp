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
						<h2>Add Products</h2>
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
						<form action="addProduct1">
							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="productCode" />
									<label class="form-label">Product Code</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="name" /> <label
										class="form-label">Product Name1</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="price" /> <label
										class="form-label">Price</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="sellingprice" />
									<label class="form-label">Selling Price</label>
								</div>
							</div>

							<div class="form-group form-float">
								<div class="form-line">
									<input type="text" class="form-control" name="quantity" /> <label
										class="form-label">Quantity1</label>
								</div>
							</div>
							<div>
								<select>
									<option value="">-- Select Category--</option>
									<c:forEach items="${categoryList}" var="categoryList">
										<option>${categoryList.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="body">
								<div class="row clearfix">
									<div class="col-sm-6">
										<select class="form-control show-tick">
											<option value="">-- Please select --</option>
											<option value="10">10</option>
											<option value="20">20</option>
											<option value="30">30</option>
											<option value="40">40</option>
											<option value="50">50</option>
										</select>
									</div>
								</div>
							</div>
							<!-- <div class="body">
                            	<div class="row clearfix">
                                	<div class="col-sm-6">
                                    <select class="form-control show-tick">
                                        <option value="">-- Please select --</option>
                                        <option value="10">10</option>
                                        <option value="20">20</option>
                                        <option value="30">30</option>
                                        <option value="40">40</option>
                                        <option value="50">50</option>
                                    </select>
                                		</div>
                            		</div>
                           		</div> -->

							<div class="body">
								<div class="row clearfix">
									<div class="col-sm-4">
										<div class="form-group">
											<div class="form-line">
												<input type="text" class="datepicker form-control"
													placeholder="Please choose a date...">
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="form-group">
											<div class="form-line">
												<input type="text" class="timepicker form-control"
													placeholder="Please choose a time...">
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="form-group">
											<div class="form-line">
												<input type="text" class="datetimepicker form-control"
													placeholder="Please choose date & time...">
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="form-line">
								<input type="radio" class="with-gap" id="ig_radio" name="active">
								<label for="ig_radio">Active</label> <input type="radio"
									class="with-gap" id="ig_radio1" name="active"> <label
									for="ig_radio1">InActive</label>
							</div>

							<button class="btn btn-primary waves-effect" type="submit">SUBMIT</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>