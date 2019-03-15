# ros2.bbclass

inherit ros_common

# Place metadata unique to ROS 2 here.

# https://index.ros.org/doc/ros2/Installation/Linux-Development-Setup/#id3 says LANG must be in the environment. Allow it to be
# overridden in local.conf .
export LANG ??= "en_US.UTF-8"
