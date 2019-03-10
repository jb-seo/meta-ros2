# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some standard service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/std_srvs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7a8a96ad3812ef51c46d0be5e9cc278e"
SRC_URI[sha256sum] = "cd76b3e0759a1bca1b6963cbe8e8d6926251eaa2553311d6fe256a3e59a893d8"
S = "${WORKDIR}/common_interfaces-release-release-crystal-std_srvs-0.6.1-0"

inherit catkin
