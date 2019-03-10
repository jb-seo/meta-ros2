# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check source files for copyright and license     information."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=ee09441fd2874bd55740e281e9f11b69"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_copyright/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "692ea2343ed741f988ca128786ab5e8e"
SRC_URI[sha256sum] = "e9ef65b67ae1c5ab53922d7c5a6a4077f817e7e730d837d00512ae5a09d0f94f"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_copyright-0.6.3-0"

inherit catkin
