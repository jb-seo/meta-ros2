# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Adds action APIs for C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "action-msgs ament-cmake ament-cmake-ros rcl-action rclcpp rosidl-generator-c rosidl-generator-cpp"
SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/crystal/rclcpp_action/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "67790e411c0f372da4bb5e8d654846c7"
SRC_URI[sha256sum] = "46196f9b9096c63632757afca56233bd20e21f1b68cbd1b5742facd64826e30e"
S = "${WORKDIR}/rclcpp-release-release-crystal-rclcpp_action-0.6.3-0"

inherit catkin
