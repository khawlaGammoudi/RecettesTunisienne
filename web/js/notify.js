
    refreshInterval = 500
refreshTimeout = setTimeout(getNotificationCounts, refreshInterval);

function getNotifications() {
  $.ajax({
    url: 'path_to_your_php',
    type: 'POST',
    data:'' ,//put for example user_id but it cvan be handled by sesion as    
    dataType: 'json',
    success: function (data) {
      alert('tu as' + data.total + ' nouveau messages')
      refreshTimeout = setTimeout(getNotificationCounts, refreshInterval);
    }
  });
}
