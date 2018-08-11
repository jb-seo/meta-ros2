# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the ROS bindings for the tf2 library, for both Python and C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake geometry-msgs rclcpp std-msgs tf2 tf2-msgs"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/bouncy/tf2_ros/0.9.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c3c1d0fbc75e278c8a1e3007b73636e"
SRC_URI[sha256sum] = "3e4973496090f34c6b4e98c4071c9805ad074f714dd4177a5c6cdcec84cac8c2"
S = "${WORKDIR}/geometry2-release-release-bouncy-tf2_ros-0.9.1-1"

inherit catkin
