# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code for style and syntax conventions with flake8."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-flake8"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_flake8/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "827f5e796f654853526f9f7788cbdca3"
SRC_URI[sha256sum] = "74372b484a6ea58894697c0960b33e8b5c3a4467894ae4c1b679ec0c7bf2a2c0"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_flake8-0.6.3-0"

inherit catkin
