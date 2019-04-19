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
                            <h2>
                                Add Category
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
                        <form action = "addCategory1">
                            <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control" name = "name"/>
                                            <label class="form-label">Category Name</label>
                                        </div>
                             </div>
                                  
							 <div class="form-group">             
                                            <input type="radio" class="with-gap" id="ig_radio" name = "active">
                                            <label for="ig_radio">Active</label>
                                            <input type="radio" class="with-gap" id="ig_radio1" name = "active">
                                            <label for="ig_radio1">InActive</label>
                             </div>
                            	        	          
                             <button class="btn btn-primary waves-effect" type="submit">SUBMIT</button>
                             
                             </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
 </section>