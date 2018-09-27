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
                            <h2>
                                Active Users
                            </h2>
                            <ul class="header-dropdown m-r--5">
                                <li class="dropdown">
                                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                        <i class="material-icons">more_vert</i>
                                    </a>
                                    <ul class="dropdown-menu pull-right">
                                        <li><a href="javascript:void(0);">Action</a></li>
                                        <li><a href="javascript:void(0);">Another action</a></li>
                                        <li><a href="javascript:void(0);">Something else here</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
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
                            <h2>
                                All Users
                            </h2>
                            <ul class="header-dropdown m-r--5">
                                <li class="dropdown">
                                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                        <i class="material-icons">more_vert</i>
                                    </a>
                                    <ul class="dropdown-menu pull-right">
                                        <li><a href="javascript:void(0);">Action</a></li>
                                        <li><a href="javascript:void(0);">Another action</a></li>
                                        <li><a href="javascript:void(0);">Something else here</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover dataTable js-exportable">
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