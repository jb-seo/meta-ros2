# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cmake macros to configure security for nodes"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=80318c4afef111a7690eaf237460856b"

DEPENDS = "cmake ros2cli sros2"
SRC_URI = "https://github.com/ros2-gbp/sros2-release/archive/release/crystal/sros2_cmake/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "660aea580d98d92c26f83bcda775ddf0"
SRC_URI[sha256sum] = "bcb14d26acd9a9f0c377b5de1f54232a122bb4d690a7965c2fc18884029d8e82"
S = "${WORKDIR}/sros2-release-release-crystal-sros2_cmake-0.6.2-0"

inherit ament
