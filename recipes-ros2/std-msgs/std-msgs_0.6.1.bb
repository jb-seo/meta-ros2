# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some standard message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/std_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09cf8a1de5574321f502a2a19b6c2858"
SRC_URI[sha256sum] = "3713d137c312f568c5bb934b6fbf9794090862f5585cf34bdc7f080007d89720"
S = "${WORKDIR}/common_interfaces-release-release-crystal-std_msgs-0.6.1-0"

inherit ament pythonpath-insane
