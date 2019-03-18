# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing message definitions and fixtures used exclusively for testing purposes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "action-msgs  builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/crystal/test_msgs/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98e51663b71865ffab21552432c7dfa2"
SRC_URI[sha256sum] = "964f1cc1493801a8dd83a8e7dfb00bf1a7df0cc9e5bcf0de947bf477ab71da72"
S = "${WORKDIR}/rcl_interfaces-release-release-crystal-test_msgs-0.6.2-0"

inherit ament pythonpath-insane
