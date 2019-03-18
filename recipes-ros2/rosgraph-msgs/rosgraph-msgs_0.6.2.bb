# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages relating to the ROS Computation Graph.     These are generally considered to be low-level messages that end users do not interact with."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/crystal/rosgraph_msgs/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "74819d018273e9857fe73947b74626ce"
SRC_URI[sha256sum] = "812910c2129f14016e9bad2566a5bf2208f24b5dd5626213d7a926ed6de6cb35"
S = "${WORKDIR}/rcl_interfaces-release-release-crystal-rosgraph_msgs-0.6.2-0"

inherit ament pythonpath-insane
