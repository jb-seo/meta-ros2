# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ stdlib-compatible wrapper around tlsf allocator and ROS2 examples"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"

DEPENDS = " rclcpp rmw std-msgs tlsf"
SRC_URI = "https://github.com/ros2-gbp/realtime_support-release/archive/release/crystal/tlsf_cpp/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "239850a24f2ca37abfb705c825d01a4c"
SRC_URI[sha256sum] = "0226cc7cd7cbe864671d5f5c83d87b483bdb6e7c0a3fb205276aec9e47acd903"
S = "${WORKDIR}/realtime_support-release-release-crystal-tlsf_cpp-0.6.0-0"

inherit ament
