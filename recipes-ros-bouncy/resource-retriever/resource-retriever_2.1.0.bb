# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package retrieves data from url-format files such as http://,    ftp://, package:// file://, etc., and loads the data into memory.    The package:// url for ros packages is translated into a local    file:// url.  The resourse retriever was initially designed to load    mesh files into memory, but it can be used for any type of    data. The resource retriever is based on the the libcurl library."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ament-index-cpp libcurl-vendor"
SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/bouncy/resource_retriever/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "757a9211721333c0b023ae1d0f03bb6f"
SRC_URI[sha256sum] = "d1f341d535a07eb7b137cc3ba35879ad9e3549d6b37770f696c4c17d06379e2b"
S = "${WORKDIR}/resource_retriever-release-release-bouncy-resource_retriever-2.1.0-0"

inherit catkin
