'use strict';

/**
 * @ngdoc function
 * @name noveaBankApp.controller:TransactionsDepositsNewCtrl
 * @description
 * # TransactionsDepositsNewCtrl
 * Controller of the noveaBankApp
 */
angular.module('noveaBankApp')
  .controller('TransactionsDepositsNewCtrl', function ($scope, $location, flash, depositResource) {

    $scope.makeDeposit = function() {
      var transactionToStore = {'amount':$scope.deposit.amount};
      var successCallback = function(data,responseHeaders){
        flash.setMessage({'type':'success','text':'Your account has been credited.'});
        $location.path('/');
      };
      var errorCallback = function(httpResponse) {
        flash.setMessage({'type':'danger','text':httpResponse.data.message}, true);
        $scope.displayError = true;
      };
      depositResource.save({'customerId':auth.authz.idTokenParsed.sub}, transactionToStore, successCallback, errorCallback);
    };

    $scope.clear = function() {
      $scope.deposit = {};
    };
  });
