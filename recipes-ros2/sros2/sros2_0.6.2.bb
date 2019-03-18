# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Command line tools for managing SROS2 keys"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "openssl ros2cli"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c64f6a7ba0664f9e9a96ba6dca56f74"
SRC_URI[sha256sum] = "fb4e577af5f26549e7f0c97a606770886b6bc3373cd26326bf6cdbc88a339e4d"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.6.2-0"

inherit ament
