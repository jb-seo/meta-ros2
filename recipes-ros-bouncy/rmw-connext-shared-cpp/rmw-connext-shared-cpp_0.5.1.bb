# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ types and functions shared by the ROS middleware interface to RTI Connext Static and RTI Connext Dynamic."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "connext-cmake-module rcutils rmw rosidl-cmake rti-connext-dds-5.3.1"
SRC_URI = "https://github.com/ros2-gbp/rmw_connext-release/archive/release/bouncy/rmw_connext_shared_cpp/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d3173ae1c26e53cbdd6caa479d707a77"
SRC_URI[sha256sum] = "cfd6dbdf28200a5a8ba8430847c636e9613d62499e2cb9c395ff6de4df69a668"
S = "${WORKDIR}/rmw_connext-release-release-bouncy-rmw_connext_shared_cpp-0.5.1-0"


inherit ros
inherit ament

