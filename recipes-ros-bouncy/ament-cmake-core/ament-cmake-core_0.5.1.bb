# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The core of the ament buildsystem in CMake.      Several subcomponents provide specific funtionalities:     * environment: provide prefix-level setup files     * environment_hooks: provide package-level setup files and environment hooks     * index: store information in an index and retrieve them without crawling     * package_templates: templates from the ament_package Python package     * symlink_install: use symlinks for CMake install commands"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-package cmake python3-catkin-pkg"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_core/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "04590e6ac4a192e4a94daf16c731ff6b"
SRC_URI[sha256sum] = "a5869158254ad56cfc96d4dd3d90c2ef97c100ef44bbc54e25db497f6e79b62a"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_core-0.5.1-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"