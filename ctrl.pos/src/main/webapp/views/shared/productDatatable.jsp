<section class="content">
        <div class="container-fluid">
            <div class="block-header">
            <script>alert("HI Hello");</script>
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
                                Active Products
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
                                            <th>Product Code</th>
                                            <th>Active</th>
                                            <th>Price</th>
                                            <th>Selling Price</th>
                                            <th>Category</th>
                                            <th>Quantity</th>
                                            <th>Expiry Date</th>
                                            <th>Actions</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Name</th>
                                            <th>Product Code</th>
                                            <th>Active</th>
                                            <th>Price</th>
                                            <th>Selling Price</th>
                                            <th>Category</th>
                                            <th>Quantity</th>
                                            <th>Expiry Date</th>
                                            <th>Actions</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                    <c:forEach items="${activeproducts}" var="activeproduct">
                                        <tr>
                                            <td>${activeproduct.name}</td>
                                            <td>${activeproduct.productCode}</td>
                                            <td>${activeproduct.active}</td>
                                            <td>${activeproduct.price}</td>
                                            <td>${activeproduct.sellingprice}</td>
                                            <td>${activeproduct.category.name}</td>
                                            <td>${activeproduct.quantity}</td>
                                            <td>${activeproduct.expiryDate}</td>                                        
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
                                            <th>Product Code</th>
                                            <th>Active</th>
                                            <th>Price</th>
                                            <th>Selling Price</th>
                                            <th>Category</th>
                                            <th>Quantity</th>
                                            <th>Expiry Date</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Name</th>
                                            <th>Product Code</th>
                                            <th>Active</th>
                                            <th>Price</th>
                                            <th>Selling Price</th>
                                            <th>Category</th>
                                            <th>Quantity</th>
                                            <th>Expiry Date</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <c:forEach items="${products}" var="product">
                                        <tr>
                                            <td>${product.name}</td>
                                            <td>${product.productCode}</td>
                                            <td>${product.active}</td>
                                            <td>${product.price}</td>
                                            <td>${product.sellingprice}</td>
                                            <td>${product.category.name}</td>
                                            <td>${product.quantity}</td>
                                            <td>${product.expiryDate}</td>
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