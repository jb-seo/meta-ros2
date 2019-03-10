# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The parser for the manifest files in the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-setuptools"
SRC_URI = "https://github.com/ros2-gbp/ament_package-release/archive/release/crystal/ament_package/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65011c1ab83c0c9967d8a815f9938b0f"
SRC_URI[sha256sum] = "93eb732b8925aa6e1c265ef6c803225354debff818830762cc887729d8e47f6b"
S = "${WORKDIR}/ament_package-release-release-crystal-ament_package-0.6.0-0"

inherit catkin
