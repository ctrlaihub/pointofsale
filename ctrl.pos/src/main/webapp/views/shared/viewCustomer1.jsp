<section class="content">
<%-- "custName":"${customers.custName}",
				"custMobileNo":"${customers.custMobileNo}",
				"email" :"${customers.email}"
 --%>	<!-- <script type="text/javascript">
		function searchText() {
			$.ajax({
				type : "POST",
				 beforeSend: function(xhr) {
					 alert("hi");
			            xhr.setRequestHeader("Accept", "application/json");
			            xhr.setRequestHeader("Content-Type", "application/json");
			        },
				contentType : 'application/json; charset=utf-8',
				dataType : 'json',
				url : "${contextRoot}/editCustomer",
				data : JSON.stringify({ custName: "John", custMobileNo: 30, email: "New York" }), // Note it is important
				error: function (data, x, e) {
				      if (x.status == 0) {
				          alert('You are offline!!\n Please Check Your Network.');
				        } else if (x.status == 404) {
				          alert('Requested URL not found.');
				        } else if (x.status == 500) {
				          alert('Internel Server Error.');
				        } else if (e == 'parsererror') {
				          alert("error: "+data+" status: "+x+" er:"+e);
				          alert('Error.\nParsing JSON Request failed.');
				        } else if (e == 'timeout') {
				          alert('Request Time out.');
				        }
				        else if (x.status == '401') {
				            alert('My Own Exception');
				        }  
				        else
				        	alert("error: "+data+" status: "+x+" er:"+e);
				      }
			});
		}
	</script> -->
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
						<h2>View Customers</h2>
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
						<div class="table-responsive">
							<table
								class="table table-bordered table-striped table-hover js-basic-example dataTable">
								<thead>
									<tr>
										<th>Customer Name</th>
										<th>Mobile No</th>
										<th>Email</th>
										<!-- <th>custType<th> -->
										<th>street</th>
										<th>city</th>
										<th>state</th>
										<th>zipcode</th> 
										<th>Options</th>
										<!-- <th>Options1</th> -->
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>${customers.custName}</td>
										<td>${customers.custMobileNo}</td>
										<td>${customers.email}</td>
										<%-- <td>${customers.custType}</td> --%>
										<td>${customers.address.street}</td>
										<td>${customers.address.city}</td>
										<td>${customers.address.state}</td>
										<td>${customers.address.zipcode}</td>
								<td><a href="${contextRoot}/editCustomer?custId=${customers.id}&custName=${customers.custName}&email=${customers.email}&mobile=${customers.custMobileNo}&street=${customers.address.street}&city=${customers.address.city}&state=${customers.address.state}&zipcode=${customers.address.zipcode}&addressid=${customers.address.addressid}">Edit</a></td>
										<!-- <td><a href="javascript:searchText()">TEST EDIT</a></td> --> 
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Basic Examples -->
	</div>
</section>