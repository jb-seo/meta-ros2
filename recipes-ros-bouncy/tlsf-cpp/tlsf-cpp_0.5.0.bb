# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ stdlib-compatible wrapper around tlsf allocator and ROS2 examples"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"

DEPENDS = "rclcpp rmw std-msgs tlsf"
SRC_URI = "https://github.com/ros2-gbp/realtime_support-release/archive/release/bouncy/tlsf_cpp/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ab7a7cd3434475bc3dfe0e28f78c6906"
SRC_URI[sha256sum] = "67033ce905229b25e55d140b23115e2450308bdbcb8c1cb04f9d34abb8c900d0"
S = "${WORKDIR}/realtime_support-release-release-bouncy-tlsf_cpp-0.5.0-0"


inherit ros
inherit ament

