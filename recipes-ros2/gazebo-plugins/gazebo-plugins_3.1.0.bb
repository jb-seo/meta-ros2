# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Robot-independent Gazebo plugins for sensors, motors and dynamic reconfigurable components."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f7d4e3a22e6490b133f4eb99348a8124"

DEPENDS = " camera-info-manager gazebo-dev gazebo-ros geometry-msgs image-transport nav-msgs rclcpp sensor-msgs std-msgs tf2-geometry-msgs tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/crystal/gazebo_plugins/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a8b344950f3c4955c4eb305cd16e6d3"
SRC_URI[sha256sum] = "1e2e266637fd1febb16ee0c4c20790e10754bb3c012a9a51683748a667ec39c4"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-crystal-gazebo_plugins-3.1.0-0"

inherit ament
