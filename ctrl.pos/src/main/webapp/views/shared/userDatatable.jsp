<section class="content">

	<script type="text/javascript">
		$(document).ready(function() {
			/* $('[data-toggle="tooltip"]').tooltip();
			var actions = $("table td:last-child").html();
			// Append table with add row form on add new button click
			$(".add-new").click(function(){
				$(this).attr("disabled", "disabled");
				var index = $("table tbody tr:last-child").index();
			    var row = '<tr>' +
			    	'<td><input type="text" class="form-control" name="id" id="id"></td>' +
			        '<td><input type="text" class="form-control" name="name" id="name"></td>' +
			        '<td><input type="text" class="form-control" name="department" id="department"></td>' +
			        '<td><input type="text" class="form-control" name="phone" id="phone"></td>' +
					'<td>' + actions + '</td>' +
			    '</tr>';
				$("table").append(row);		
				$("table tbody tr").eq(index + 1).find(".add, .edit").toggle();
			    $('[data-toggle="tooltip"]').tooltip();
			});
			// Add row on add button click
			$(document).on("click", ".add", function(){
				var empty = false;
				var input = $(this).parents("tr").find('input[type="text"]');
			    input.each(function(){
					if(!$(this).val()){
						$(this).addClass("error");
						empty = true;
					} else{
			            $(this).removeClass("error");
			        }
				});
				$(this).parents("tr").find(".error").first().focus();
				if(!empty){
					input.each(function(){
						$(this).parent("td").html($(this).val());
					});			
					$(this).parents("tr").find(".add, .edit").toggle();
					$(".add-new").removeAttr("disabled");
				}		
			});*/
			
			// Edit row on edit button click
			$(document).on("click", ".edit", function(){	
				alert("I am in edit");
			    $(this).parents("tr").find("td:not(:last-child)").each(function(){
					$(this).html('<input type="text" class="form-control" value="' + $(this).text() + '">');
				});		
				$(this).parents("tr").find(".add, .edit").toggle();
				$(".add-new").attr("disabled", "disabled");
			});
			
			// Delete row on delete button click
			$(document).on("click", ".delete", function() {
				var customerId = $(this).parent().find('input').val();
				alert(" customerId -------> " + customerId);
				var workingObject = $(this);
				$.ajax({
					type : "POST",
					url : "/ctrlaihub/deleteUser?id=" + customerId,
					success : function(resultMsg) {
						alert("success");
						workingObject.closest("tr").remove();
					},
					error : function(e) {
						alert("ERROR: ", e);
						console.log("ERROR: ", e);
					}
				});
			});
		});
	</script>


	<div class="container-fluid">
		<div class="block-header">
			<h2>
				WELCOME ${uname}
				<!-- <small>Taken from <a href="https://datatables.net/" target="_blank">datatables.net</a></small> -->
			</h2>
		</div>
		<!-- Basic Examples -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>Active Users</h2>
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
										<th>Name</th>
										<th>Email</th>
										<th>Active</th>
										<th>Street</th>
										<th>City</th>
										<th>State</th>
										<th>Pincode</th>
										<th>Authority</th>
										<th>Salary</th>
										<th>Actions</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>Name</th>
										<th>Email</th>
										<th>Active</th>
										<th>Street</th>
										<th>City</th>
										<th>State</th>
										<th>Pincode</th>
										<th>Authority</th>
										<th>Salary</th>
										<th>Actions</th>
									</tr>
								</tfoot>
								<tbody>
									<c:forEach items="${users}" var="user">
										<tr>
											<td>${user.name}</td>
											<td>${user.email}</td>
											<td>${user.active}</td>
											<td>${user.address.street}</td>
											<td>${user.address.city}</td>
											<td>${user.address.state}</td>
											<td>${user.address.zipcode}</td>
											<td>${user.authority}</td>
											<td>$320,800</td>
											<td><input type="hidden" value="${user.id}">
												<a class="edit" title="Edit" data-toggle="tooltip"><i
													class="material-icons">&#xE254;</i></a> <a class="delete"
												title="Delete" data-toggle="tooltip"><i
													class="material-icons">&#xE872;</i></a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Basic Examples -->
		<!-- Exportable Table -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>All Users</h2>
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
								class="table table-bordered table-striped table-hover dataTable js-exportable">
								<thead>
									<tr>
										<th>Name</th>
										<th>Email</th>
										<th>Active</th>
										<th>Street</th>
										<th>City</th>
										<th>State</th>
										<th>Pincode</th>
										<th>Authority</th>
										<th>Salary</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>Name</th>
										<th>Email</th>
										<th>Active</th>
										<th>Street</th>
										<th>City</th>
										<th>State</th>
										<th>Pincode</th>
										<th>Authority</th>
										<th>Salary</th>
									</tr>
								</tfoot>
								<tbody>
									<c:forEach items="${allusers}" var="alluser">
										<tr>
											<td>${alluser.name}</td>
											<td>${alluser.email}</td>
											<td>${alluser.active}</td>
											<td>${alluser.address.street}</td>
											<td>${alluser.address.city}</td>
											<td>${alluser.address.state}</td>
											<td>${alluser.address.zipcode}</td>
											<td>${alluser.authority}</td>
											<td>$320,800</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Exportable Table -->
	</div>
</section>