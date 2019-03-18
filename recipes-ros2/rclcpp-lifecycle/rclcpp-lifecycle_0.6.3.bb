# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing a prototype for lifecycle implementation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " lifecycle-msgs rcl-lifecycle rclcpp rclpy rmw-implementation rosidl-typesupport-cpp"
SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/crystal/rclcpp_lifecycle/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aa15581572d7b5f219e0e69ab7b55804"
SRC_URI[sha256sum] = "9db46339e9c75b89756a15883ded25981bb98889cec190b696c43775b697b81f"
S = "${WORKDIR}/rclcpp-release-release-crystal-rclcpp_lifecycle-0.6.3-0"

inherit ament
