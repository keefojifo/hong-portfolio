<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- Contact Section Form -->
      <div class="row">
        <div class="col-lg-8 mx-auto">
          <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
          <form name="login" id="login" novalidate="novalidate">
            <div class="control-group">
              <div class="form-group floating-label-form-group controls mb-0 pb-2">
               
                <label for="uiId">ID</label>
                <input class="form-control" id="uiId" type="text" placeholder="ID" required="required" data-validation-required-message="Please enter your ID">
                <p class="help-block text-danger"></p>
              </div>
            </div>
            <div class="control-group">
              <div class="form-group floating-label-form-group controls mb-0 pb-2">
               
               
                <label for="uiPwd" >Password</label>
                <input class="form-control" id="uiPwd" type="text" placeholder="Password" required="required" data-validation-required-message="Please enter your Password.">
                <p class="help-block text-danger"></p>
              </div>
            </div>
            <div id="success"></div>
            <div class="form-group">
            
              <button type="submit" class="btn btn-primary btn-xl" id="loginbutton" style="float:right" >LOGIN</button>
            </div>
          </form>
        </div>
      </div>