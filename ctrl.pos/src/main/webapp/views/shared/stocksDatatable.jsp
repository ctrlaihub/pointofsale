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
                                Active Stocks
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
                                            
                                            <th>Product Code</th>
                                            <th>Price</th>
                                            <th>Selling Price</th>
                                            <th>Category</th>
                                            <th>Quantity</th>
                                            <th>Expiry Date</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            
                                            <th>Product Code</th>
                                            <th>Price</th>
                                            <th>Selling Price</th>
                                            <th>Category</th>
                                            <th>Quantity</th>
                                            <th>Expiry Date</th>
                                            
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                    <c:forEach items="${activestocks}" var="activestock">
                                        <tr>
                                            
                                            <td>${activestock.productCode}</td>
                                            <td>${activestock.price}</td>
                                            <td>${activestock.sellingprice}</td>
                                            <td>${activestock.category.name}</td>
                                            <td>${activestock.quantity}</td>
                                            <td>${activestock.expiryDate}</td>
                                                                                       
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

            <!-- #END# Exportable Table -->
        </div>
    </section>