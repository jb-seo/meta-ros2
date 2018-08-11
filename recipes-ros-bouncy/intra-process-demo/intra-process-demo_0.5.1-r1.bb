# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demonstrations of intra process communication."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake libopencv-dev rclcpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/intra_process_demo/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fe9f2bf3fb62d29e255137089a7ca9e6"
SRC_URI[sha256sum] = "960a3d44d2d6284a1ceff47fb01c1aaf4cd7464a49f85fc261c6220ca26b02c4"
S = "${WORKDIR}/demos-release-release-bouncy-intra_process_demo-0.5.1-1"

inherit catkin
