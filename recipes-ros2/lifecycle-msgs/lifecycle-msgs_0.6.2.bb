# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some lifecycle related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/crystal/lifecycle_msgs/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b00b50a495b75c82cd51f155d5cb837"
SRC_URI[sha256sum] = "64bf8032a624f9c4b1b41bd3f6550e6f9611a36eeb86d2247327b4e8309271b0"
S = "${WORKDIR}/rcl_interfaces-release-release-crystal-lifecycle_msgs-0.6.2-0"

inherit ament pythonpath-insane
