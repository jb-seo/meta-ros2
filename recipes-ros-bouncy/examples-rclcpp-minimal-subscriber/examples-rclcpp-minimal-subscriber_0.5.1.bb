# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal subscribers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rclcpp std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclcpp_minimal_subscriber/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d81abaf04361200f3c86e10f4a1d5c6"
SRC_URI[sha256sum] = "d664490b717d1b63bb6a7f0d4e227af638d3c92a73509e2f5366955cf2fa020b"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclcpp_minimal_subscriber-0.5.1-0"

inherit catkin
